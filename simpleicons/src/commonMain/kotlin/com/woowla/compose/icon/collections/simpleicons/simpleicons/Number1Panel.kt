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

public val Simpleicons.Number1Panel: ImageVector
    get() {
        if (_number1Panel != null) {
            return _number1Panel!!
        }
        _number1Panel = Builder(name = "Number1Panel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                lineToRelative(10.349f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.651f, 18.0f)
                lineTo(1.651f, 6.0f)
                close()
                moveTo(12.0f, 0.326f)
                lineTo(1.897f, 6.158f)
                verticalLineToRelative(11.664f)
                lineTo(12.0f, 23.653f)
                lineToRelative(10.103f, -5.831f)
                lineTo(22.103f, 6.158f)
                close()
                moveTo(8.84f, 20.523f)
                lineToRelative(-5.801f, -3.349f)
                lineTo(3.039f, 6.826f)
                lineTo(12.0f, 1.653f)
                lineToRelative(2.23f, 1.287f)
                lineToRelative(-8.925f, 5.195f)
                verticalLineToRelative(7.73f)
                lineToRelative(5.792f, 3.345f)
                close()
                moveTo(15.139f, 3.465f)
                lineTo(20.961f, 6.826f)
                verticalLineToRelative(10.348f)
                lineTo(12.0f, 22.347f)
                lineToRelative(-2.274f, -1.312f)
                lineToRelative(8.969f, -5.17f)
                verticalLineToRelative(-7.73f)
                lineToRelative(-5.823f, -3.362f)
                close()
                moveTo(13.002f, 6.815f)
                verticalLineToRelative(2.869f)
                lineToRelative(0.024f, 7.666f)
                lineToRelative(-0.691f, 0.384f)
                lineToRelative(-2.18f, -1.249f)
                lineToRelative(0.008f, -6.801f)
                lineTo(8.958f, 9.684f)
                lineTo(8.95f, 8.351f)
                lineToRelative(3.412f, -1.965f)
                close()
            }
        }
        .build()
        return _number1Panel!!
    }

private var _number1Panel: ImageVector? = null
