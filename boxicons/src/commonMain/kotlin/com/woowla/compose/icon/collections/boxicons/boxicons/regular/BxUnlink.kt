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

public val RegularGroup.BxUnlink: ImageVector
    get() {
        if (_bxUnlink != null) {
            return _bxUnlink!!
        }
        _bxUnlink = Builder(name = "BxUnlink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.949f, 14.121f)
                lineTo(19.071f, 12.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 0.0f, -7.071f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -7.071f, 0.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(0.707f, -0.707f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, 4.243f)
                lineToRelative(-2.122f, 2.121f)
                arcToRelative(2.723f, 2.723f, 0.0f, false, true, -0.844f, 0.57f)
                lineTo(13.414f, 12.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, -3.535f, -1.465f)
                curveToRelative(-0.235f, 0.0f, -0.464f, 0.032f, -0.691f, 0.066f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.536f, -5.536f)
                curveToRelative(0.277f, -0.184f, 0.538f, -0.396f, 0.778f, -0.636f)
                close()
                moveTo(10.586f, 17.657f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, -4.243f)
                lineToRelative(1.476f, -1.475f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(4.929f, 12.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 0.0f, 7.071f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, 3.535f, 1.462f)
                arcTo(4.982f, 4.982f, 0.0f, false, false, 12.0f, 19.071f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _bxUnlink!!
    }

private var _bxUnlink: ImageVector? = null
