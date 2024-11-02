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

public val Simpleicons.Clevercloud: ImageVector
    get() {
        if (_clevercloud != null) {
            return _clevercloud!!
        }
        _clevercloud = Builder(name = "Clevercloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.823f, 11.139f)
                lineTo(11.253f, 0.0f)
                lineTo(1.608f, 5.57f)
                close()
                moveTo(1.235f, 6.646f)
                verticalLineToRelative(10.708f)
                lineTo(4.325f, 12.0f)
                close()
                moveTo(12.0f, 23.57f)
                lineToRelative(6.43f, -11.14f)
                lineTo(5.57f, 12.43f)
                close()
                moveTo(12.0f, 0.43f)
                lineTo(5.57f, 11.57f)
                horizontalLineToRelative(12.86f)
                close()
                moveTo(22.764f, 17.354f)
                lineTo(22.764f, 6.646f)
                lineTo(19.674f, 12.0f)
                close()
                moveTo(22.765f, 18.216f)
                lineTo(22.391f, 18.431f)
                lineTo(19.176f, 12.861f)
                lineTo(12.746f, 24.0f)
                close()
                moveTo(22.765f, 5.785f)
                lineTo(12.745f, 0.0f)
                lineToRelative(6.431f, 11.139f)
                lineToRelative(3.215f, -5.57f)
                close()
                moveTo(1.235f, 18.216f)
                lineTo(11.254f, 24.0f)
                lineToRelative(-6.43f, -11.138f)
                lineToRelative(-3.216f, 5.569f)
                close()
            }
        }
        .build()
        return _clevercloud!!
    }

private var _clevercloud: ImageVector? = null
