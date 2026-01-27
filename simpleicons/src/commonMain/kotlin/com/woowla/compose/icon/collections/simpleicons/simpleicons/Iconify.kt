package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Iconify: ImageVector
    get() {
        if (_iconify != null) {
            return _iconify!!
        }
        _iconify = Builder(name = "Iconify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.857f, 19.429f)
                lineTo(2.857f, 9.642f)
                curveToRelative(0.232f, -0.06f, 0.458f, -0.158f, 0.67f, -0.295f)
                lineTo(5.143f, 8.302f)
                verticalLineToRelative(9.983f)
                horizontalLineToRelative(4.571f)
                verticalLineToRelative(2.286f)
                lineTo(4.0f, 20.571f)
                curveToRelative(-0.631f, 0.0f, -1.143f, -0.512f, -1.143f, -1.143f)
                close()
                moveTo(10.286f, 10.857f)
                curveToRelative(0.0f, -0.946f, 0.768f, -1.714f, 1.714f, -1.714f)
                curveToRelative(0.946f, 0.0f, 1.714f, 0.768f, 1.714f, 1.714f)
                curveToRelative(0.0f, 0.951f, -0.775f, 1.714f, -1.714f, 1.714f)
                curveToRelative(-0.939f, 0.0f, -1.714f, -0.763f, -1.714f, -1.714f)
                close()
                moveTo(5.143f, 2.857f)
                lineTo(5.143f, 1.143f)
                curveTo(5.143f, 0.512f, 5.655f, 0.0f, 6.286f, 0.0f)
                curveToRelative(0.631f, 0.0f, 1.143f, 0.512f, 1.143f, 1.143f)
                verticalLineToRelative(0.235f)
                close()
                moveTo(14.286f, 18.286f)
                horizontalLineToRelative(4.571f)
                lineTo(18.857f, 8.302f)
                lineToRelative(1.615f, 1.045f)
                curveToRelative(0.212f, 0.137f, 0.438f, 0.235f, 0.67f, 0.295f)
                verticalLineToRelative(9.786f)
                curveToRelative(0.0f, 0.631f, -0.512f, 1.143f, -1.143f, 1.143f)
                horizontalLineToRelative(-5.714f)
                close()
                moveTo(14.282f, 1.258f)
                lineTo(22.335f, 6.469f)
                curveToRelative(0.529f, 0.343f, 0.681f, 1.051f, 0.338f, 1.581f)
                curveToRelative(-0.343f, 0.529f, -1.051f, 0.681f, -1.581f, 0.338f)
                lineTo(13.052f, 3.185f)
                lineToRelative(0.19f, -0.123f)
                curveToRelative(0.64f, -0.414f, 1.004f, -1.095f, 1.041f, -1.803f)
                close()
                moveTo(11.379f, 0.183f)
                curveToRelative(0.53f, -0.343f, 1.238f, -0.191f, 1.581f, 0.338f)
                curveToRelative(0.343f, 0.53f, 0.191f, 1.238f, -0.338f, 1.581f)
                lineTo(2.907f, 8.388f)
                curveToRelative(-0.53f, 0.343f, -1.238f, 0.191f, -1.581f, -0.338f)
                curveToRelative(-0.343f, -0.53f, -0.191f, -1.238f, 0.338f, -1.581f)
                close()
                moveTo(13.979f, 22.286f)
                lineTo(22.0f, 22.286f)
                curveToRelative(0.473f, 0.0f, 0.857f, 0.384f, 0.857f, 0.857f)
                arcTo(0.858f, 0.858f, 0.0f, false, true, 22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                arcToRelative(0.858f, 0.858f, 0.0f, false, true, -0.857f, -0.857f)
                curveToRelative(0.0f, -0.473f, 0.384f, -0.857f, 0.857f, -0.857f)
                horizontalLineToRelative(8.021f)
                curveToRelative(0.395f, 0.683f, 1.134f, 1.143f, 1.979f, 1.143f)
                reflectiveCurveToRelative(1.584f, -0.46f, 1.979f, -1.143f)
                close()
                moveTo(13.143f, 13.476f)
                verticalLineToRelative(7.667f)
                curveToRelative(0.0f, 0.631f, -0.512f, 1.143f, -1.143f, 1.143f)
                reflectiveCurveToRelative(-1.143f, -0.512f, -1.143f, -1.143f)
                lineTo(10.857f, 13.476f)
                arcToRelative(2.845f, 2.845f, 0.0f, false, false, 1.143f, 0.238f)
                curveToRelative(0.406f, 0.0f, 0.793f, -0.085f, 1.143f, -0.238f)
                close()
            }
        }
        .build()
        return _iconify!!
    }

private var _iconify: ImageVector? = null
