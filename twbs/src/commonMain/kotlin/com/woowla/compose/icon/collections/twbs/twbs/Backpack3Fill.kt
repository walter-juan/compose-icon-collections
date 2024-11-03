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

public val Twbs.Backpack3Fill: ImageVector
    get() {
        if (_backpack3Fill != null) {
            return _backpack3Fill!!
        }
        _backpack3Fill = Builder(name = "Backpack3Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                verticalLineToRelative(0.341f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.308f, 0.653f)
                lineToRelative(-0.416f, -1.247f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.749f, -0.284f)
                lineToRelative(-0.77f, 1.027f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.149f, 0.917f)
                lineToRelative(0.803f, 2.407f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 16.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                lineTo(14.0f, 8.0f)
                curveToRelative(0.0f, -0.771f, -0.146f, -1.509f, -0.41f, -2.186f)
                lineToRelative(0.801f, -2.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.148f, -0.917f)
                lineToRelative(-0.77f, -1.027f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.75f, 0.284f)
                lineToRelative(-0.415f, 1.247f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 2.34f)
                lineTo(10.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(0.083f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
                moveTo(12.941f, 4.595f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.8f, -0.937f)
                lineToRelative(0.531f, -1.595f)
                lineToRelative(0.77f, 1.027f)
                close()
                moveTo(3.86f, 3.658f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.8f, 0.937f)
                lineTo(2.557f, 3.09f)
                lineToRelative(0.77f, -1.027f)
                close()
                moveTo(4.04f, 7.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.92f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.99f, 0.142f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.94f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.99f, -0.142f)
                moveTo(4.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _backpack3Fill!!
    }

private var _backpack3Fill: ImageVector? = null
