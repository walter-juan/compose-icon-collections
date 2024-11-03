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

public val Twbs.SimSlashFill: ImageVector
    get() {
        if (_simSlashFill != null) {
            return _simSlashFill!!
        }
        _simSlashFill = Builder(name = "SimSlashFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.646f, 0.44f)
                lineToRelative(0.897f, 0.896f)
                lineToRelative(-1.703f, 1.703f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(5.379f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(2.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                moveTo(8.5f, 5.378f)
                lineTo(9.879f, 4.0f)
                lineTo(8.5f, 4.0f)
                close()
                moveTo(5.0f, 8.879f)
                lineTo(6.879f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(11.0f, 7.121f)
                lineTo(9.121f, 9.0f)
                lineTo(11.0f, 9.0f)
                close()
                moveTo(7.5f, 10.621f)
                lineTo(6.121f, 12.0f)
                lineTo(7.5f, 12.0f)
                close()
                moveTo(5.5f, 13.0f)
                quadToRelative(-0.175f, 0.0f, -0.34f, -0.039f)
                lineTo(2.502f, 15.62f)
                curveToRelative(0.265f, 0.236f, 0.615f, 0.38f, 0.998f, 0.38f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(14.0f, 4.121f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(12.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(5.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(8.5f, 10.0f)
                lineTo(11.0f, 10.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.854f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineToRelative(-13.0f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _simSlashFill!!
    }

private var _simSlashFill: ImageVector? = null
