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

public val Twbs.BadgeAd: ImageVector
    get() {
        if (_badgeAd != null) {
            return _badgeAd!!
        }
        _badgeAd = Builder(name = "BadgeAd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.7f, 11.0f)
                lineToRelative(0.47f, -1.542f)
                horizontalLineToRelative(2.004f)
                lineTo(6.644f, 11.0f)
                horizontalLineToRelative(1.261f)
                lineTo(5.901f, 5.001f)
                lineTo(4.513f, 5.001f)
                lineTo(2.5f, 11.0f)
                close()
                moveTo(5.203f, 6.148f)
                lineTo(5.937f, 8.574f)
                lineTo(4.416f, 8.574f)
                lineToRelative(0.734f, -2.426f)
                close()
                moveTo(9.962f, 6.276f)
                curveToRelative(-1.059f, 0.0f, -1.753f, 0.765f, -1.753f, 2.043f)
                verticalLineToRelative(0.695f)
                curveToRelative(0.0f, 1.279f, 0.685f, 2.043f, 1.74f, 2.043f)
                curveToRelative(0.677f, 0.0f, 1.222f, -0.33f, 1.367f, -0.804f)
                horizontalLineToRelative(0.057f)
                lineTo(11.373f, 11.0f)
                horizontalLineToRelative(1.138f)
                lineTo(12.511f, 4.685f)
                horizontalLineToRelative(-1.16f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(-0.053f)
                curveToRelative(-0.18f, -0.475f, -0.68f, -0.77f, -1.336f, -0.77f)
                close()
                moveTo(10.349f, 7.199f)
                curveToRelative(0.58f, 0.0f, 1.002f, 0.44f, 1.002f, 1.138f)
                verticalLineToRelative(0.602f)
                curveToRelative(0.0f, 0.76f, -0.396f, 1.2f, -0.984f, 1.2f)
                curveToRelative(-0.598f, 0.0f, -0.972f, -0.449f, -0.972f, -1.248f)
                verticalLineToRelative(-0.453f)
                curveToRelative(0.0f, -0.795f, 0.37f, -1.24f, 0.954f, -1.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _badgeAd!!
    }

private var _badgeAd: ImageVector? = null
