package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShieldMinus: ImageVector
    get() {
        if (_bxShieldMinus != null) {
            return _bxShieldMinus!!
        }
        _bxShieldMinus = Builder(name = "BxShieldMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.41f, 6.11f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, -0.89f, 0.0f)
                lineToRelative(-8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 6.9f)
                curveToRelative(0.0f, 0.11f, -1.0f, 10.77f, 8.59f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.41f, 0.1f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.4f, -0.09f)
                curveTo(21.92f, 17.67f, 21.0f, 7.0f, 21.0f, 6.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.59f, -0.79f)
                close()
                moveTo(12.0f, 19.9f)
                curveTo(5.2f, 16.63f, 4.88f, 9.64f, 4.93f, 7.63f)
                lineToRelative(7.0f, -3.51f)
                lineToRelative(7.0f, 3.51f)
                curveToRelative(0.13f, 2.01f, -0.19f, 9.0f, -6.93f, 12.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bxShieldMinus!!
    }

private var _bxShieldMinus: ImageVector? = null
