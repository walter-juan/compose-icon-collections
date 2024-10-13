package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsChurch: ImageVector
    get() {
        if (_bxsChurch != null) {
            return _bxsChurch!!
        }
        _bxsChurch = Builder(name = "BxsChurch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
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
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.118f)
                lineToRelative(-2.447f, 1.224f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 2.0f, 16.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(21.447f, 15.105f)
                lineTo(19.0f, 13.882f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                close()
            }
        }
        .build()
        return _bxsChurch!!
    }

private var _bxsChurch: ImageVector? = null
