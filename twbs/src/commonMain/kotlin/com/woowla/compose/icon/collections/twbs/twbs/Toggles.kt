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

public val Twbs.Toggles: ImageVector
    get() {
        if (_toggles != null) {
            return _toggles!!
        }
        _toggles = Builder(name = "Toggles", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                close()
                moveTo(11.5f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                moveToRelative(-7.0f, -14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(2.45f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.95f, 6.0f)
                horizontalLineToRelative(4.55f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(4.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
            }
        }
        .build()
        return _toggles!!
    }

private var _toggles: ImageVector? = null
