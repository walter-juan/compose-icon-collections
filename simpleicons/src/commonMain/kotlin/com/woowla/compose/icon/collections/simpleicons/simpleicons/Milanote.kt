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

public val Simpleicons.Milanote: ImageVector
    get() {
        if (_milanote != null) {
            return _milanote!!
        }
        _milanote = Builder(name = "Milanote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 12.943f)
                lineTo(15.057f, 16.0f)
                lineTo(8.943f, 16.0f)
                close()
                moveTo(16.0f, 8.943f)
                verticalLineToRelative(6.114f)
                lineTo(12.943f, 12.0f)
                close()
                moveTo(8.0f, 15.057f)
                lineTo(8.0f, 8.943f)
                lineTo(11.057f, 12.0f)
                close()
                moveTo(16.917f, 17.284f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, false, 0.367f, -0.367f)
                lineToRelative(-0.003f, 0.009f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, false, 0.052f, -0.26f)
                lineTo(17.333f, 7.334f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -1.138f, -0.471f)
                lineTo(12.0f, 11.057f)
                lineTo(7.805f, 6.862f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -1.138f, 0.471f)
                verticalLineToRelative(9.334f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.666f, 0.666f)
                horizontalLineToRelative(9.334f)
                curveToRelative(0.092f, 0.0f, 0.18f, -0.018f, 0.26f, -0.052f)
                lineToRelative(-0.01f, 0.004f)
                close()
            }
        }
        .build()
        return _milanote!!
    }

private var _milanote: ImageVector? = null
