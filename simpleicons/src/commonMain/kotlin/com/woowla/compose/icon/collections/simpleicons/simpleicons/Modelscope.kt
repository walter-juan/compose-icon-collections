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

public val Simpleicons.Modelscope: ImageVector
    get() {
        if (_modelscope != null) {
            return _modelscope!!
        }
        _modelscope = Builder(name = "Modelscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.667f, 5.333f)
                lineTo(2.667f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(5.333f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.666f)
                lineTo(0.5f, 10.667f)
                lineTo(0.5f, 8.5f)
                horizontalLineToRelative(2.166f)
                verticalLineToRelative(2.166f)
                horizontalLineToRelative(2.666f)
                lineTo(5.332f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 5.333f)
                close()
                moveTo(2.667f, 13.333f)
                verticalLineToRelative(5.334f)
                lineTo(8.0f, 18.667f)
                lineTo(8.0f, 16.0f)
                lineTo(5.333f, 16.0f)
                verticalLineToRelative(-2.667f)
                close()
                moveTo(16.0f, 5.333f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(2.666f)
                lineTo(21.333f, 8.5f)
                lineTo(23.5f, 8.5f)
                verticalLineToRelative(2.166f)
                horizontalLineToRelative(-2.166f)
                verticalLineToRelative(2.666f)
                lineTo(24.0f, 13.332f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-2.667f)
                lineTo(21.333f, 5.333f)
                close()
                moveTo(21.333f, 13.333f)
                horizontalLineToRelative(-2.666f)
                lineTo(18.667f, 16.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(5.333f)
                close()
                moveTo(8.0f, 10.667f)
                verticalLineToRelative(2.666f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.666f)
                close()
                moveTo(10.667f, 13.333f)
                lineTo(10.667f, 16.0f)
                horizontalLineToRelative(2.666f)
                verticalLineToRelative(-2.667f)
                close()
                moveTo(13.333f, 13.333f)
                lineTo(16.0f, 13.333f)
                verticalLineToRelative(-2.666f)
                horizontalLineToRelative(-2.667f)
                close()
            }
        }
        .build()
        return _modelscope!!
    }

private var _modelscope: ImageVector? = null
