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

public val RegularGroup.BxSlider: ImageVector
    get() {
        if (_bxSlider != null) {
            return _bxSlider!!
        }
        _bxSlider = Builder(name = "BxSlider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 15.0f)
                lineTo(17.0f, 9.012f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxSlider!!
    }

private var _bxSlider: ImageVector? = null
