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

public val Simpleicons.Kongregate: ImageVector
    get() {
        if (_kongregate != null) {
            return _kongregate!!
        }
        _kongregate = Builder(name = "Kongregate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.667f, 0.0f)
                arcTo(2.667f, 2.667f, 0.0f, false, false, 0.0f, 2.667f)
                verticalLineToRelative(18.666f)
                arcTo(2.667f, 2.667f, 0.0f, false, false, 2.667f, 24.0f)
                horizontalLineToRelative(18.666f)
                arcTo(2.667f, 2.667f, 0.0f, false, false, 24.0f, 21.333f)
                lineTo(24.0f, 2.667f)
                arcTo(2.667f, 2.667f, 0.0f, false, false, 21.333f, 0.0f)
                close()
                moveTo(5.6f, 5.333f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(5.334f)
                lineTo(13.6f, 10.667f)
                verticalLineToRelative(2.666f)
                lineTo(8.267f, 13.333f)
                verticalLineToRelative(5.334f)
                lineTo(5.6f, 18.667f)
                close()
                moveTo(13.6f, 13.333f)
                horizontalLineToRelative(1.678f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.43f, 0.885f)
                lineTo(17.6f, 16.0f)
                horizontalLineToRelative(1.333f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(-2.666f)
                close()
                moveTo(13.6f, 10.667f)
                lineTo(16.267f, 5.333f)
                horizontalLineToRelative(2.666f)
                lineTo(18.933f, 8.0f)
                lineTo(17.6f, 8.0f)
                lineToRelative(-0.891f, 1.782f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.431f, 0.885f)
                close()
            }
        }
        .build()
        return _kongregate!!
    }

private var _kongregate: ImageVector? = null
