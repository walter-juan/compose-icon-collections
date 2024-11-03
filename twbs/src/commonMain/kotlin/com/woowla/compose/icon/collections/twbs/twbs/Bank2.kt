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

public val Twbs.Bank2: ImageVector
    get() {
        if (_bank2 != null) {
            return _bank2!!
        }
        _bank2 = Builder(name = "Bank2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.277f, 0.084f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.554f, 0.0f)
                lineToRelative(-7.5f, 5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.5f, 6.0f)
                horizontalLineToRelative(1.875f)
                verticalLineToRelative(7.0f)
                lineTo(1.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-0.875f)
                lineTo(13.625f, 6.0f)
                lineTo(15.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.277f, -0.916f)
                close()
                moveTo(12.375f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.25f)
                lineTo(11.125f, 6.0f)
                close()
                moveTo(9.875f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.25f)
                lineTo(8.625f, 6.0f)
                close()
                moveTo(7.375f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.25f)
                lineTo(6.125f, 6.0f)
                close()
                moveTo(4.875f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.25f)
                lineTo(3.625f, 6.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveTo(0.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bank2!!
    }

private var _bank2: ImageVector? = null
