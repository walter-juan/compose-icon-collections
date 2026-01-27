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

public val SolidGroup.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.4f, 179.2f)
                curveTo(142.0f, 127.7f, 196.8f, 96.0f, 256.2f, 96.0f)
                reflectiveCurveToRelative(114.2f, 31.7f, 143.9f, 83.2f)
                lineTo(508.7f, 368.0f)
                curveToRelative(12.3f, 21.3f, -3.1f, 48.0f, -27.7f, 48.0f)
                lineTo(31.5f, 416.0f)
                curveToRelative(-24.6f, 0.0f, -40.0f, -26.6f, -27.7f, -48.0f)
                lineTo(112.4f, 179.2f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
