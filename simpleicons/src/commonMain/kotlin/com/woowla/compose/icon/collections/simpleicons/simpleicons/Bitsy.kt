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

public val Simpleicons.Bitsy: ImageVector
    get() {
        if (_bitsy != null) {
            return _bitsy!!
        }
        _bitsy = Builder(name = "Bitsy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.143f, 12.0f)
                verticalLineToRelative(10.29f)
                horizontalLineToRelative(-3.429f)
                verticalLineToRelative(-3.43f)
                lineTo(6.857f, 18.86f)
                verticalLineToRelative(3.43f)
                lineTo(3.43f, 22.29f)
                verticalLineToRelative(-6.86f)
                lineTo(0.0f, 15.43f)
                lineTo(0.0f, 1.71f)
                horizontalLineToRelative(3.429f)
                verticalLineToRelative(3.43f)
                horizontalLineToRelative(3.428f)
                lineTo(6.857f, 1.71f)
                horizontalLineToRelative(3.429f)
                lineTo(10.286f, 12.0f)
                close()
                moveTo(20.571f, 8.57f)
                lineTo(20.571f, 1.71f)
                lineTo(24.0f, 1.71f)
                verticalLineToRelative(6.86f)
                close()
                moveTo(17.143f, 12.0f)
                lineTo(17.143f, 8.57f)
                horizontalLineToRelative(3.428f)
                lineTo(20.571f, 12.0f)
                close()
            }
        }
        .build()
        return _bitsy!!
    }

private var _bitsy: ImageVector? = null
