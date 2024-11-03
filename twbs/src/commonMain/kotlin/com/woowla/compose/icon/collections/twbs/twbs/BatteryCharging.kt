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

public val Twbs.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.585f, 2.568f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.226f, 0.58f)
                lineTo(8.677f, 6.832f)
                horizontalLineToRelative(1.99f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.364f, 0.843f)
                lineToRelative(-5.334f, 5.667f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.842f, -0.49f)
                lineTo(5.99f, 9.167f)
                horizontalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.364f, -0.843f)
                lineToRelative(5.333f, -5.667f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.616f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                horizontalLineToRelative(4.332f)
                lineToRelative(-0.94f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-0.308f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                horizontalLineToRelative(2.45f)
                lineTo(2.908f, 7.639f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.313f, 10.0f)
                lineTo(2.0f, 10.0f)
                close()
                moveTo(10.595f, 4.0f)
                lineTo(10.287f, 5.0f)
                lineTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(9.276f, 11.0f)
                lineToRelative(-0.942f, 1.0f)
                lineTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineToRelative(-1.783f)
                lineToRelative(1.542f, -1.639f)
                quadToRelative(0.146f, -0.156f, 0.241f, -0.34f)
                close()
                moveTo(12.0f, 6.646f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(-0.646f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.646f, 0.646f)
                moveTo(16.0f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 8.0f)
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
