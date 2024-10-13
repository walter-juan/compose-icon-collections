package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsEditLocation: ImageVector
    get() {
        if (_bxsEditLocation != null) {
            return _bxsEditLocation!!
        }
        _bxsEditLocation = Builder(name = "BxsEditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.589f, 2.0f, 4.0f, 5.589f, 4.0f, 9.995f)
                curveTo(3.971f, 16.44f, 11.696f, 21.784f, 12.0f, 22.0f)
                curveToRelative(0.0f, 0.0f, 8.029f, -5.56f, 8.0f, -12.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(9.799f, 14.987f)
                lineTo(8.0f, 14.987f)
                verticalLineToRelative(-1.799f)
                lineToRelative(4.977f, -4.97f)
                lineToRelative(1.799f, 1.799f)
                lineToRelative(-4.977f, 4.97f)
                close()
                moveTo(15.623f, 9.17f)
                lineTo(13.824f, 7.371f)
                lineTo(15.196f, 6.0f)
                lineToRelative(1.799f, 1.799f)
                lineToRelative(-1.372f, 1.371f)
                close()
            }
        }
        .build()
        return _bxsEditLocation!!
    }

private var _bxsEditLocation: ImageVector? = null
