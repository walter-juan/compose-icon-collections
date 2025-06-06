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

public val Twbs.Handbag: ImageVector
    get() {
        if (_handbag != null) {
            return _handbag!!
        }
        _handbag = Builder(name = "Handbag", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(3.0f, 4.0f)
                lineTo(11.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.36f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.483f, 1.277f)
                lineTo(0.85f, 13.13f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.322f, 16.0f)
                horizontalLineToRelative(9.355f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.473f, -2.87f)
                lineToRelative(-1.028f, -6.853f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.64f, 5.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(1.639f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.494f, 0.426f)
                lineToRelative(1.028f, 6.851f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.678f, 15.0f)
                lineTo(3.322f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.483f, -1.723f)
                lineToRelative(1.028f, -6.851f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.36f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _handbag!!
    }

private var _handbag: ImageVector? = null
