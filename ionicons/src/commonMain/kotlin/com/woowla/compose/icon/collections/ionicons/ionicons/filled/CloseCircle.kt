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

public val FilledGroup.CloseCircle: ImageVector
    get() {
        if (_closeCircle != null) {
            return _closeCircle!!
        }
        _closeCircle = Builder(name = "CloseCircle", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(331.31f, 308.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.62f, 22.62f)
                lineTo(256.0f, 278.63f)
                lineToRelative(-52.69f, 52.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f)
                lineTo(233.37f, 256.0f)
                lineToRelative(-52.68f, -52.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -22.62f)
                lineTo(256.0f, 233.37f)
                lineToRelative(52.69f, -52.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 22.62f)
                lineTo(278.63f, 256.0f)
                close()
            }
        }
        .build()
        return _closeCircle!!
    }

private var _closeCircle: ImageVector? = null
