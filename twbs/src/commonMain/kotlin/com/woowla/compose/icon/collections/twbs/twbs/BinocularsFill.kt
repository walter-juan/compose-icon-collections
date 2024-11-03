package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BinocularsFill: ImageVector
    get() {
        if (_binocularsFill != null) {
            return _binocularsFill!!
        }
        _binocularsFill = Builder(name = "BinocularsFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 2.5f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 1.0f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.882f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.276f, 0.447f)
                lineToRelative(0.895f, 0.447f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 7.118f)
                lineTo(15.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.354f)
                lineToRelative(0.854f, -0.853f)
                lineTo(10.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.793f)
                lineToRelative(0.854f, 0.853f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 11.5f)
                lineTo(7.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                lineTo(1.0f, 7.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, -1.342f)
                lineToRelative(0.894f, -0.447f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 4.882f)
                lineTo(3.0f, 4.0f)
                close()
                moveTo(1.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 16.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 14.5f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 2.5f)
                close()
            }
        }
        .build()
        return _binocularsFill!!
    }

private var _binocularsFill: ImageVector? = null
