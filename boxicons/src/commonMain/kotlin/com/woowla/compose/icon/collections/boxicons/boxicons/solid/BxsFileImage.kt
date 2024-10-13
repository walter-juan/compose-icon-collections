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

public val SolidGroup.BxsFileImage: ImageVector
    get() {
        if (_bxsFileImage != null) {
            return _bxsFileImage!!
        }
        _bxsFileImage = Builder(name = "BxsFileImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(8.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 11.0f)
                close()
                moveTo(9.0f, 16.0f)
                lineTo(10.597f, 17.363f)
                lineTo(13.0f, 13.0f)
                lineToRelative(4.0f, 6.0f)
                lineTo(7.0f, 19.0f)
                lineToRelative(2.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bxsFileImage!!
    }

private var _bxsFileImage: ImageVector? = null
