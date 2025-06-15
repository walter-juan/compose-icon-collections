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

public val Simpleicons.Inquirer: ImageVector
    get() {
        if (_inquirer != null) {
            return _inquirer!!
        }
        _inquirer = Builder(name = "Inquirer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.132f, 7.14f)
                verticalLineToRelative(-0.99f)
                horizontalLineToRelative(0.992f)
                verticalLineToRelative(-0.992f)
                horizontalLineToRelative(5.752f)
                verticalLineToRelative(0.992f)
                horizontalLineToRelative(0.793f)
                verticalLineToRelative(0.991f)
                horizontalLineToRelative(0.992f)
                verticalLineToRelative(2.777f)
                horizontalLineToRelative(-0.992f)
                verticalLineToRelative(0.992f)
                horizontalLineToRelative(-0.793f)
                verticalLineToRelative(0.992f)
                horizontalLineToRelative(-0.992f)
                verticalLineToRelative(0.992f)
                horizontalLineToRelative(-0.991f)
                verticalLineToRelative(2.975f)
                horizontalLineToRelative(-1.786f)
                lineTo(11.107f, 12.1f)
                horizontalLineToRelative(0.992f)
                verticalLineToRelative(-0.992f)
                horizontalLineToRelative(0.992f)
                verticalLineToRelative(-0.991f)
                horizontalLineToRelative(0.992f)
                verticalLineToRelative(-0.992f)
                horizontalLineToRelative(0.991f)
                verticalLineToRelative(-1.19f)
                horizontalLineToRelative(-0.991f)
                verticalLineToRelative(-0.992f)
                lineTo(9.917f, 6.943f)
                verticalLineToRelative(0.992f)
                horizontalLineToRelative(-0.991f)
                verticalLineToRelative(1.983f)
                lineTo(7.14f, 9.918f)
                lineTo(7.14f, 7.14f)
                close()
                moveTo(5.554f, 6.942f)
                lineTo(1.587f, 6.942f)
                verticalLineToRelative(10.116f)
                horizontalLineToRelative(3.967f)
                verticalLineToRelative(1.785f)
                lineTo(0.0f, 18.843f)
                lineTo(0.0f, 5.157f)
                horizontalLineToRelative(5.554f)
                close()
                moveTo(18.446f, 6.942f)
                horizontalLineToRelative(3.967f)
                verticalLineToRelative(10.116f)
                horizontalLineToRelative(-3.967f)
                verticalLineToRelative(1.785f)
                lineTo(24.0f, 18.843f)
                lineTo(24.0f, 5.157f)
                horizontalLineToRelative(-5.554f)
                close()
                moveTo(11.107f, 17.058f)
                horizontalLineToRelative(1.786f)
                verticalLineToRelative(1.785f)
                horizontalLineToRelative(-1.786f)
                close()
            }
        }
        .build()
        return _inquirer!!
    }

private var _inquirer: ImageVector? = null
