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

public val Simpleicons.BackstageCasting: ImageVector
    get() {
        if (_backstageCasting != null) {
            return _backstageCasting!!
        }
        _backstageCasting = Builder(name = "BackstageCasting", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2f, 0.0f)
                verticalLineToRelative(0.056f)
                arcToRelative(5.997f, 5.997f, 0.0f, false, true, 0.0f, 11.886f)
                verticalLineToRelative(0.113f)
                arcToRelative(5.997f, 5.997f, 0.0f, false, true, 0.0f, 11.886f)
                verticalLineToRelative(0.056f)
                horizontalLineToRelative(12.552f)
                verticalLineTo(0.0f)
                close()
                moveTo(1.248f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(9.54f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _backstageCasting!!
    }

private var _backstageCasting: ImageVector? = null
