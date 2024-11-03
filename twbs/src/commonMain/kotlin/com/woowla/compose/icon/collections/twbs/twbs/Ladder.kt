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

public val Twbs.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(11.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 12.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
