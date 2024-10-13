package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxChurch: ImageVector
    get() {
        if (_bxChurch != null) {
            return _bxChurch!!
        }
        _bxChurch = Builder(name = "BxChurch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.447f, 14.105f)
                lineTo(18.0f, 12.382f)
                lineTo(18.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.485f, -0.857f)
                lineTo(13.0f, 8.434f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.434f)
                lineToRelative(-4.515f, 2.709f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 12.0f)
                verticalLineToRelative(0.382f)
                lineToRelative(-3.447f, 1.724f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 2.0f, 15.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                close()
                moveTo(4.0f, 15.618f)
                lineToRelative(2.0f, -1.0f)
                lineTo(6.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-4.382f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-7.434f)
                lineToRelative(4.0f, -2.4f)
                lineToRelative(4.0f, 2.4f)
                lineTo(16.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.382f)
                lineToRelative(2.0f, 1.0f)
                lineTo(20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxChurch!!
    }

private var _bxChurch: ImageVector? = null
