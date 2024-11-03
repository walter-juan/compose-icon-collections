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

public val Twbs.SignNoParkingFill: ImageVector
    get() {
        if (_signNoParkingFill != null) {
            return _signNoParkingFill!!
        }
        _signNoParkingFill = Builder(name = "SignNoParkingFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.292f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.0f, 2.707f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5.5f, 12.0f)
                horizontalLineToRelative(1.283f)
                lineTo(6.783f, 9.164f)
                horizontalLineToRelative(1.674f)
                close()
                moveTo(14.0f, 13.292f)
                lineTo(9.63f, 8.922f)
                curveTo(10.5f, 8.524f, 11.0f, 7.662f, 11.0f, 6.587f)
                curveToRelative(0.0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                lineTo(5.5f, 4.003f)
                verticalLineToRelative(0.79f)
                lineTo(2.708f, 2.002f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 14.0f, 13.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.777f, 7.485f)
                verticalLineToRelative(0.59f)
                horizontalLineToRelative(0.59f)
                close()
                moveTo(8.726f, 8.02f)
                lineTo(6.777f, 6.07f)
                verticalLineToRelative(-0.966f)
                lineTo(8.27f, 5.104f)
                curveToRelative(0.893f, 0.0f, 1.419f, 0.539f, 1.419f, 1.482f)
                curveToRelative(0.0f, 0.769f, -0.35f, 1.273f, -0.963f, 1.433f)
                close()
            }
        }
        .build()
        return _signNoParkingFill!!
    }

private var _signNoParkingFill: ImageVector? = null
