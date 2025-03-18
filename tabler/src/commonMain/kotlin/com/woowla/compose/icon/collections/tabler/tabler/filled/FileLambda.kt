package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.FileLambda: ImageVector
    get() {
        if (_fileLambda != null) {
            return _fileLambda!!
        }
        _fileLambda = Builder(name = "FileLambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveTo(10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.117f, 0.007f)
                curveToRelative(0.342f, 0.0f, 0.662f, 0.362f, 1.166f, 1.445f)
                lineToRelative(-1.998f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.664f, 1.11f)
                lineToRelative(1.29f, -1.934f)
                curveToRelative(0.825f, 1.738f, 1.508f, 2.379f, 2.878f, 2.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, -1.993f)
                lineToRelative(-0.117f, -0.007f)
                curveToRelative(-0.39f, 0.0f, -0.75f, -0.47f, -1.387f, -1.938f)
                lineToRelative(-0.415f, -0.976f)
                curveToRelative(-0.985f, -2.274f, -1.656f, -3.086f, -3.198f, -3.086f)
                moveToRelative(4.999f, -7.001f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _fileLambda!!
    }

private var _fileLambda: ImageVector? = null
