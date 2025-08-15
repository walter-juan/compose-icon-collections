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

public val Simpleicons.Mistralai: ImageVector
    get() {
        if (_mistralai != null) {
            return _mistralai!!
        }
        _mistralai = Builder(name = "Mistralai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.143f, 3.429f)
                verticalLineToRelative(3.428f)
                horizontalLineToRelative(-3.429f)
                verticalLineToRelative(3.429f)
                horizontalLineToRelative(-3.428f)
                verticalLineTo(6.857f)
                horizontalLineTo(6.857f)
                verticalLineTo(3.43f)
                horizontalLineTo(3.43f)
                verticalLineToRelative(13.714f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.428f)
                horizontalLineToRelative(10.286f)
                verticalLineToRelative(-3.428f)
                horizontalLineTo(6.857f)
                verticalLineToRelative(-3.429f)
                horizontalLineToRelative(3.429f)
                verticalLineToRelative(3.429f)
                horizontalLineToRelative(3.429f)
                verticalLineToRelative(-3.429f)
                horizontalLineToRelative(3.428f)
                verticalLineToRelative(3.429f)
                horizontalLineToRelative(-3.428f)
                verticalLineToRelative(3.428f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.428f)
                horizontalLineToRelative(-3.43f)
                verticalLineTo(3.429f)
                close()
            }
        }
        .build()
        return _mistralai!!
    }

private var _mistralai: ImageVector? = null
