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

public val RegularGroup.BxBowlHot: ImageVector
    get() {
        if (_bxBowlHot != null) {
            return _bxBowlHot!!
        }
        _bxBowlHot = Builder(name = "BxBowlHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 5.0f, 8.66f)
                lineTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.34f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(15.55f, 18.16f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.55f, 0.9f)
                lineTo(15.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-0.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.55f, -0.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.06f, 12.0f)
                horizontalLineToRelative(15.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.39f, 6.16f)
                close()
                moveTo(9.0f, 9.0f)
                lineTo(9.0f, 7.93f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -1.28f, -3.15f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 7.0f, 3.0f)
                lineTo(7.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, 1.28f, 3.17f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 7.0f, 7.93f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(13.0f, 7.93f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -1.28f, -3.15f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 11.0f, 3.0f)
                lineTo(11.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, 1.28f, 3.15f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 11.0f, 7.93f)
                lineTo(11.0f, 9.0f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(17.0f, 7.93f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -1.28f, -3.15f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 15.0f, 3.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, 1.28f, 3.15f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 15.0f, 7.93f)
                lineTo(15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxBowlHot!!
    }

private var _bxBowlHot: ImageVector? = null
