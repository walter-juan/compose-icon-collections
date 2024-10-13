package com.woowla.compose.icon.collections.devicons.devicons.css3

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Css3Group

public val Css3Group.PlainWordmark: ImageVector
    get() {
        if (_plainWordmark != null) {
            return _plainWordmark!!
        }
        _plainWordmark = Builder(name = "PlainWordmark", defaultWidth = 128.0.dp, defaultHeight =
                128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1572B6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.67f, 26.0f)
                lineToRelative(8.07f, 90.49f)
                lineToRelative(36.21f, 10.05f)
                lineToRelative(36.31f, -10.06f)
                lineTo(108.33f, 26.0f)
                lineTo(19.67f, 26.0f)
                close()
                moveTo(88.88f, 76.49f)
                lineTo(86.53f, 98.38f)
                lineToRelative(0.01f, 1.88f)
                lineTo(64.0f, 106.55f)
                verticalLineToRelative(0.0f)
                lineToRelative(-0.02f, 0.01f)
                lineToRelative(-22.72f, -6.22f)
                lineTo(39.73f, 83.0f)
                horizontalLineToRelative(11.14f)
                lineToRelative(0.79f, 8.77f)
                lineToRelative(12.35f, 3.3f)
                lineToRelative(-0.0f, 0.01f)
                verticalLineToRelative(-0.03f)
                lineToRelative(12.39f, -3.49f)
                lineTo(77.7f, 77.0f)
                lineTo(51.79f, 77.0f)
                lineToRelative(-0.22f, -2.36f)
                lineToRelative(-0.51f, -5.65f)
                lineTo(50.8f, 66.0f)
                horizontalLineToRelative(27.89f)
                lineToRelative(1.01f, -11.0f)
                lineTo(37.23f, 55.0f)
                lineToRelative(-0.22f, -2.59f)
                lineToRelative(-0.51f, -6.03f)
                lineTo(36.24f, 43.0f)
                horizontalLineToRelative(55.6f)
                lineToRelative(-0.27f, 3.33f)
                lineToRelative(-2.68f, 30.15f)
                moveTo(89.0f, 14.37f)
                lineTo(81.85f, 6.0f)
                lineTo(89.0f, 6.0f)
                lineTo(89.0f, 1.0f)
                lineTo(73.0f, 1.0f)
                verticalLineToRelative(4.36f)
                lineTo(81.39f, 13.0f)
                lineTo(73.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(70.0f, 14.37f)
                lineTo(63.19f, 6.0f)
                lineTo(70.0f, 6.0f)
                lineTo(70.0f, 1.0f)
                lineTo(55.0f, 1.0f)
                verticalLineToRelative(4.36f)
                lineTo(62.73f, 13.0f)
                lineTo(55.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(52.0f, 13.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(44.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                lineTo(52.0f, 1.0f)
                lineTo(38.0f, 1.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _plainWordmark!!
    }

private var _plainWordmark: ImageVector? = null
