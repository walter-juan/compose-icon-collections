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

public val Simpleicons.Paperswithcode: ImageVector
    get() {
        if (_paperswithcode != null) {
            return _paperswithcode!!
        }
        _paperswithcode = Builder(name = "Paperswithcode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(4.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.4f, 4.4f)
                horizontalLineToRelative(2.0f)
                lineTo(4.4f, 2.0f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(19.6f, 2.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.2f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.6f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 2.0f)
                horizontalLineToRelative(-4.4f)
                close()
                moveTo(3.6f, 5.6f)
                verticalLineToRelative(12.8f)
                lineTo(6.0f, 18.4f)
                lineTo(6.0f, 5.6f)
                lineTo(3.6f, 5.6f)
                close()
                moveTo(10.8f, 5.6f)
                verticalLineToRelative(12.8f)
                horizontalLineToRelative(2.4f)
                lineTo(13.2f, 5.6f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(18.0f, 5.6f)
                verticalLineToRelative(12.8f)
                horizontalLineToRelative(2.4f)
                lineTo(20.4f, 5.6f)
                lineTo(18.0f, 5.6f)
                close()
                moveTo(7.2f, 6.4f)
                verticalLineToRelative(11.2f)
                horizontalLineToRelative(2.4f)
                lineTo(9.6f, 6.4f)
                lineTo(7.2f, 6.4f)
                close()
                moveTo(14.4f, 6.4f)
                verticalLineToRelative(11.2f)
                horizontalLineToRelative(2.4f)
                lineTo(16.8f, 6.4f)
                horizontalLineToRelative(-2.4f)
                close()
            }
        }
        .build()
        return _paperswithcode!!
    }

private var _paperswithcode: ImageVector? = null
