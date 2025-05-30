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

public val Twbs.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) {
            return _boundingBox!!
        }
        _boundingBox = Builder(name = "BoundingBox", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                lineTo(5.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(12.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(1.0f, 4.0f)
                lineTo(1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
