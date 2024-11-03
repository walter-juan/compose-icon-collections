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

public val Twbs.Box2: ImageVector
    get() {
        if (_box2 != null) {
            return _box2!!
        }
        _box2 = Builder(name = "Box2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.95f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, -0.4f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, 0.4f)
                lineToRelative(2.85f, 3.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.1f, 0.3f)
                lineTo(16.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(0.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.1f, -0.3f)
                close()
                moveTo(7.5f, 1.0f)
                lineTo(3.75f, 1.0f)
                lineTo(1.5f, 4.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(8.5f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-2.25f, -3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _box2!!
    }

private var _box2: ImageVector? = null
