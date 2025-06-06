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

public val Twbs.BeakerFill: ImageVector
    get() {
        if (_beakerFill != null) {
            return _beakerFill!!
        }
        _beakerFill = Builder(name = "BeakerFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.575f, 0.006f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.327f, 0.79f)
                lineToRelative(-0.048f, 0.058f)
                lineToRelative(-0.122f, 0.12f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 2.743f)
                lineTo(15.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(3.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(1.0f, 2.742f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.566f, -1.584f)
                lineTo(0.268f, 0.975f)
                lineTo(0.146f, 0.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(11.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(9.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(11.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(9.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 3.0f)
                close()
            }
        }
        .build()
        return _beakerFill!!
    }

private var _beakerFill: ImageVector? = null
