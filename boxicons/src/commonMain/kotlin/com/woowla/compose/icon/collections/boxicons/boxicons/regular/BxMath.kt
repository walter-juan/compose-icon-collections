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

public val RegularGroup.BxMath: ImageVector
    get() {
        if (_bxMath != null) {
            return _bxMath!!
        }
        _bxMath = Builder(name = "BxMath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(8.29f, 14.29f)
                lineTo(6.0f, 16.59f)
                lineToRelative(-2.29f, -2.3f)
                lineToRelative(-1.42f, 1.42f)
                lineTo(4.59f, 18.0f)
                lineToRelative(-2.3f, 2.29f)
                lineToRelative(1.42f, 1.42f)
                lineTo(6.0f, 19.41f)
                lineToRelative(2.29f, 2.3f)
                lineToRelative(1.42f, -1.42f)
                lineTo(7.41f, 18.0f)
                lineToRelative(2.3f, -2.29f)
                lineToRelative(-1.42f, -1.42f)
                close()
            }
        }
        .build()
        return _bxMath!!
    }

private var _bxMath: ImageVector? = null
