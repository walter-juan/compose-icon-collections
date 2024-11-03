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

public val Twbs.TrainFreightFrontFill: ImageVector
    get() {
        if (_trainFreightFrontFill != null) {
            return _trainFreightFrontFill!!
        }
        _trainFreightFrontFill = Builder(name = "TrainFreightFrontFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.736f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.67f, 0.158f)
                lineTo(1.828f, 1.776f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 3.118f)
                verticalLineToRelative(5.51f)
                lineToRelative(2.0f, -0.6f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.028f)
                lineToRelative(2.0f, 0.6f)
                verticalLineToRelative(-5.51f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.83f, -1.342f)
                lineTo(10.936f, 0.158f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.264f, 0.0f)
                close()
                moveTo(15.0f, 9.672f)
                lineToRelative(-5.503f, -1.65f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.353f, 8.0f)
                lineTo(8.5f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
                moveTo(7.5f, 16.0f)
                lineTo(7.5f, 8.0f)
                horizontalLineToRelative(-0.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.144f, 0.021f)
                lineTo(1.0f, 9.672f)
                lineTo(1.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.5f, 16.0f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(2.728f)
                lineToRelative(-2.216f, -0.665f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.354f, 7.0f)
                lineTo(8.5f, 7.0f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(7.5f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.853f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.431f, 0.063f)
                lineTo(4.0f, 7.728f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(3.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(7.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
            }
        }
        .build()
        return _trainFreightFrontFill!!
    }

private var _trainFreightFrontFill: ImageVector? = null
