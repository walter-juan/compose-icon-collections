package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TicketPerforated: ImageVector
    get() {
        if (_ticketPerforated != null) {
            return _ticketPerforated!!
        }
        _ticketPerforated = Builder(name = "TicketPerforated", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.85f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(11.0f, 4.85f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(4.0f, 6.65f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(11.0f, 6.65f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(4.0f, 8.45f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(11.0f, 8.45f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(4.0f, 10.25f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
                moveTo(11.0f, 10.25f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 13.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 6.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 3.0f)
                close()
                moveTo(1.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 4.9f)
                verticalLineToRelative(1.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -4.9f)
                close()
            }
        }
        .build()
        return _ticketPerforated!!
    }

private var _ticketPerforated: ImageVector? = null
