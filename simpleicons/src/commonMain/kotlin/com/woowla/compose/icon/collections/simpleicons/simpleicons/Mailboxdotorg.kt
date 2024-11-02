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

public val Simpleicons.Mailboxdotorg: ImageVector
    get() {
        if (_mailboxdotorg != null) {
            return _mailboxdotorg!!
        }
        _mailboxdotorg = Builder(name = "Mailboxdotorg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.229f, 22.844f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.501f)
                lineToRelative(-8.628f, 5.882f)
                curveToRelative(-0.613f, 0.419f, -1.226f, -0.003f, -1.226f, -0.003f)
                lineTo(0.0f, 6.646f)
                verticalLineToRelative(13.969f)
                reflectiveCurveToRelative(0.0f, 2.229f, 2.229f, 2.229f)
                moveToRelative(12.558f, -9.273f)
                lineTo(24.0f, 7.261f)
                verticalLineTo(1.156f)
                horizontalLineTo(2.229f)
                reflectiveCurveTo(0.0f, 1.156f, 0.0f, 3.384f)
                verticalLineToRelative(0.06f)
                lineToRelative(14.787f, 10.127f)
                close()
            }
        }
        .build()
        return _mailboxdotorg!!
    }

private var _mailboxdotorg: ImageVector? = null
