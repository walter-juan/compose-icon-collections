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

public val Simpleicons.Anytype: ImageVector
    get() {
        if (_anytype != null) {
            return _anytype!!
        }
        _anytype = Builder(name = "Anytype", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.333f, 0.0f)
                horizontalLineToRelative(13.334f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 24.0f, 5.333f)
                verticalLineToRelative(13.334f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 18.667f, 24.0f)
                lineTo(5.333f, 24.0f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 0.0f, 18.667f)
                lineTo(0.0f, 5.333f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 5.333f, 0.0f)
                close()
                moveTo(15.667f, 7.667f)
                verticalLineToRelative(-3.0f)
                lineTo(6.344f, 4.667f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.667f, 7.667f)
                verticalLineToRelative(11.666f)
                horizontalLineToRelative(3.0f)
                lineTo(18.667f, 7.667f)
                close()
                moveTo(9.5f, 19.333f)
                arcToRelative(4.833f, 4.833f, 0.0f, true, false, 0.0f, -9.666f)
                arcToRelative(4.833f, 4.833f, 0.0f, false, false, 0.0f, 9.666f)
                close()
            }
        }
        .build()
        return _anytype!!
    }

private var _anytype: ImageVector? = null
