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

public val Twbs.LaptopFill: ImageVector
    get() {
        if (_laptopFill != null) {
            return _laptopFill!!
        }
        _laptopFill = Builder(name = "LaptopFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 3.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 2.0f)
                close()
                moveTo(0.0f, 12.5f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 12.5f)
            }
        }
        .build()
        return _laptopFill!!
    }

private var _laptopFill: ImageVector? = null
