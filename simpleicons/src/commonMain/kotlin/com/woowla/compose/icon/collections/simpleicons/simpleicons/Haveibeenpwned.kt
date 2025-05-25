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

public val Simpleicons.Haveibeenpwned: ImageVector
    get() {
        if (_haveibeenpwned != null) {
            return _haveibeenpwned!!
        }
        _haveibeenpwned = Builder(name = "Haveibeenpwned", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.89f, 3.872f)
                lineTo(0.0f, 13.598f)
                horizontalLineToRelative(4.7f)
                lineToRelative(1.889f, -9.726f)
                close()
                moveTo(7.171f, 8.56f)
                lineToRelative(-0.98f, 5.038f)
                horizontalLineToRelative(4.7f)
                lineToRelative(0.98f, -5.038f)
                close()
                moveTo(13.107f, 9.866f)
                lineTo(12.384f, 13.598f)
                horizontalLineToRelative(4.7f)
                lineToRelative(0.722f, -3.732f)
                close()
                moveTo(19.299f, 9.866f)
                lineTo(18.576f, 13.598f)
                horizontalLineToRelative(4.7f)
                lineTo(24.0f, 9.866f)
                close()
                moveTo(5.912f, 15.09f)
                lineToRelative(-0.979f, 5.038f)
                horizontalLineToRelative(4.7f)
                lineToRelative(0.98f, -5.038f)
                close()
            }
        }
        .build()
        return _haveibeenpwned!!
    }

private var _haveibeenpwned: ImageVector? = null
