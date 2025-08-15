package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 272.0f)
                curveTo(144.0f, 224.7f, 109.8f, 185.4f, 64.8f, 177.5f)
                curveTo(72.0f, 113.6f, 126.2f, 64.0f, 192.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(65.8f, 0.0f, 120.0f, 49.6f, 127.2f, 113.5f)
                curveToRelative(-45.0f, 8.0f, -79.2f, 47.2f, -79.2f, 94.5f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(0.0f, 384.0f)
                lineTo(0.0f, 272.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
