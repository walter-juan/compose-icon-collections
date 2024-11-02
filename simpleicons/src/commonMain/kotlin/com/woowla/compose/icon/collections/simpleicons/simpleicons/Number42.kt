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

public val Simpleicons.Number42: ImageVector
    get() {
        if (_number42 != null) {
            return _number42!!
        }
        _number42 = Builder(name = "Number42", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.581f, 16.851f)
                lineTo(24.0f, 16.851f)
                verticalLineToRelative(-4.439f)
                close()
                moveTo(24.0f, 3.574f)
                horizontalLineToRelative(-4.419f)
                verticalLineToRelative(4.42f)
                lineToRelative(-4.419f, 4.418f)
                verticalLineToRelative(4.44f)
                horizontalLineToRelative(4.419f)
                verticalLineToRelative(-4.44f)
                lineTo(24.0f, 7.993f)
                close()
                moveTo(19.581f, 3.574f)
                horizontalLineToRelative(-4.419f)
                verticalLineToRelative(4.42f)
                close()
                moveTo(13.257f, 12.412f)
                lineTo(4.419f, 12.412f)
                lineToRelative(8.838f, -8.838f)
                lineTo(8.838f, 3.574f)
                lineTo(0.0f, 12.412f)
                verticalLineToRelative(3.595f)
                horizontalLineToRelative(8.838f)
                verticalLineToRelative(4.419f)
                horizontalLineToRelative(4.419f)
                close()
            }
        }
        .build()
        return _number42!!
    }

private var _number42: ImageVector? = null
