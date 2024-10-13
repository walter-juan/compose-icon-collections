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

public val RegularGroup.BxShieldPlus: ImageVector
    get() {
        if (_bxShieldPlus != null) {
            return _bxShieldPlus!!
        }
        _bxShieldPlus = Builder(name = "BxShieldPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.63f, 21.91f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.41f, -0.09f)
                curveTo(22.0f, 17.67f, 21.0f, 7.0f, 21.0f, 6.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.55f, -0.79f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.9f, 0.0f)
                lineToRelative(-8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 6.9f)
                curveToRelative(0.0f, 0.1f, -0.92f, 10.77f, 8.63f, 15.01f)
                close()
                moveTo(5.0f, 7.63f)
                lineToRelative(7.0f, -3.51f)
                lineToRelative(7.0f, 3.51f)
                curveToRelative(0.05f, 2.0f, -0.27f, 9.0f, -7.0f, 12.27f)
                curveTo(5.26f, 16.63f, 4.94f, 9.64f, 5.0f, 7.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.06f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.01f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.01f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxShieldPlus!!
    }

private var _bxShieldPlus: ImageVector? = null
