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

public val Simpleicons.Nexon: ImageVector
    get() {
        if (_nexon != null) {
            return _nexon!!
        }
        _nexon = Builder(name = "Nexon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.138f, 10.158f)
                verticalLineToRelative(3.693f)
                horizontalLineToRelative(3.775f)
                verticalLineToRelative(-0.783f)
                lineTo(6.126f, 13.068f)
                verticalLineToRelative(-0.706f)
                horizontalLineToRelative(2.787f)
                verticalLineToRelative(-0.789f)
                lineTo(6.126f, 11.573f)
                verticalLineToRelative(-0.632f)
                horizontalLineToRelative(2.787f)
                verticalLineToRelative(-0.783f)
                close()
                moveTo(20.916f, 13.851f)
                verticalLineToRelative(-2.234f)
                lineToRelative(2.34f, 2.234f)
                lineTo(24.0f, 13.851f)
                verticalLineToRelative(-3.693f)
                horizontalLineToRelative(-0.987f)
                verticalLineToRelative(2.234f)
                lineToRelative(-2.34f, -2.234f)
                horizontalLineToRelative(-0.745f)
                verticalLineToRelative(3.693f)
                close()
                moveTo(18.865f, 10.15f)
                horizontalLineToRelative(-4.072f)
                verticalLineToRelative(3.7f)
                horizontalLineToRelative(4.072f)
                close()
                moveTo(17.877f, 13.068f)
                lineTo(15.78f, 13.068f)
                verticalLineToRelative(-2.127f)
                horizontalLineToRelative(2.097f)
                close()
                moveTo(0.987f, 13.851f)
                verticalLineToRelative(-2.234f)
                lineToRelative(2.34f, 2.234f)
                horizontalLineToRelative(0.748f)
                verticalLineToRelative(-3.693f)
                horizontalLineToRelative(-0.99f)
                verticalLineToRelative(2.234f)
                lineToRelative(-2.34f, -2.234f)
                lineTo(0.0f, 10.158f)
                verticalLineToRelative(3.693f)
                close()
                moveTo(11.228f, 12.007f)
                lineTo(9.595f, 13.851f)
                horizontalLineToRelative(1.249f)
                lineToRelative(1.009f, -1.14f)
                lineToRelative(1.012f, 1.14f)
                horizontalLineToRelative(1.249f)
                lineToRelative(-1.637f, -1.844f)
                lineToRelative(1.64f, -1.849f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.014f, 1.145f)
                lineToRelative(-1.012f, -1.145f)
                lineTo(9.589f, 10.158f)
                close()
            }
        }
        .build()
        return _nexon!!
    }

private var _nexon: ImageVector? = null
