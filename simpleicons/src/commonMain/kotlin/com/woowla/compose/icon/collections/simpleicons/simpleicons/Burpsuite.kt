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

public val Simpleicons.Burpsuite: ImageVector
    get() {
        if (_burpsuite != null) {
            return _burpsuite!!
        }
        _burpsuite = Builder(name = "Burpsuite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(11.063f, 3.357f)
                horizontalLineToRelative(1.874f)
                verticalLineToRelative(2.756f)
                lineTo(10.41f, 9.2f)
                horizontalLineToRelative(2.527f)
                verticalLineToRelative(3.748f)
                horizontalLineToRelative(4.579f)
                lineToRelative(-4.578f, 5.592f)
                verticalLineToRelative(2.104f)
                horizontalLineToRelative(-1.876f)
                verticalLineToRelative(-2.758f)
                lineToRelative(2.528f, -3.086f)
                horizontalLineToRelative(-2.527f)
                lineTo(11.063f, 11.05f)
                horizontalLineToRelative(-4.58f)
                lineToRelative(4.58f, -5.592f)
                close()
            }
        }
        .build()
        return _burpsuite!!
    }

private var _burpsuite: ImageVector? = null
