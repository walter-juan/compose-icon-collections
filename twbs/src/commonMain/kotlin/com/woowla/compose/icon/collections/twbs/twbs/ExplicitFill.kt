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

public val Twbs.ExplicitFill: ImageVector
    get() {
        if (_explicitFill != null) {
            return _explicitFill!!
        }
        _explicitFill = Builder(name = "ExplicitFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 16.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.5f, 0.0f)
                close()
                moveTo(6.826f, 10.88f)
                lineTo(10.5f, 10.88f)
                lineTo(10.5f, 12.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(5.5f, 4.002f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.12f)
                lineTo(6.826f, 5.122f)
                lineTo(6.826f, 7.4f)
                horizontalLineToRelative(3.457f)
                verticalLineToRelative(1.073f)
                lineTo(6.826f, 8.473f)
                close()
            }
        }
        .build()
        return _explicitFill!!
    }

private var _explicitFill: ImageVector? = null
