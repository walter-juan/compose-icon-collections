package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.HeartCircle: ImageVector
    get() {
        if (_heartCircle != null) {
            return _heartCircle!!
        }
        _heartCircle = Builder(name = "HeartCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(330.69f, 300.82f)
                curveToRelative(-9.38f, 11.44f, -26.4f, 29.73f, -65.7f, 56.41f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -18.0f, 0.0f)
                curveToRelative(-39.3f, -26.68f, -56.32f, -45.0f, -65.7f, -56.41f)
                curveToRelative(-20.0f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
                curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
                curveToRelative(20.4f, 0.0f, 35.0f, 10.63f, 44.1f, 20.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.72f, 0.0f)
                curveToRelative(9.11f, -9.78f, 23.7f, -20.41f, 44.1f, -20.41f)
                curveToRelative(30.31f, 0.0f, 55.22f, 25.27f, 55.53f, 56.33f)
                curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
                close()
            }
        }
        .build()
        return _heartCircle!!
    }

private var _heartCircle: ImageVector? = null