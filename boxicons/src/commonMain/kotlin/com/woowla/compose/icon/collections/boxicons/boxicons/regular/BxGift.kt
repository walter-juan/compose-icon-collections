package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxGift: ImageVector
    get() {
        if (_bxGift != null) {
            return _bxGift!!
        }
        _bxGift = Builder(name = "BxGift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-1.209f)
                arcTo(4.92f, 4.92f, 0.0f, false, false, 19.0f, 5.5f)
                curveTo(19.0f, 3.57f, 17.43f, 2.0f, 15.5f, 2.0f)
                curveToRelative(-1.622f, 0.0f, -2.705f, 1.482f, -3.404f, 3.085f)
                curveTo(11.407f, 3.57f, 10.269f, 2.0f, 8.5f, 2.0f)
                curveTo(6.57f, 2.0f, 5.0f, 3.57f, 5.0f, 5.5f)
                curveToRelative(0.0f, 0.596f, 0.079f, 1.089f, 0.209f, 1.5f)
                lineTo(4.0f, 7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.5f, 4.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                curveTo(17.0f, 7.0f, 16.374f, 7.0f, 16.0f, 7.0f)
                horizontalLineToRelative(-2.478f)
                curveToRelative(0.511f, -1.576f, 1.253f, -3.0f, 1.978f, -3.0f)
                close()
                moveTo(7.0f, 5.5f)
                curveTo(7.0f, 4.673f, 7.673f, 4.0f, 8.5f, 4.0f)
                curveToRelative(0.888f, 0.0f, 1.714f, 1.525f, 2.198f, 3.0f)
                lineTo(8.0f, 7.0f)
                curveToRelative(-0.374f, 0.0f, -1.0f, 0.0f, -1.0f, -1.5f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 9.085f)
                lineTo(13.017f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineToRelative(0.001f, 2.0f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxGift!!
    }

private var _bxGift: ImageVector? = null
