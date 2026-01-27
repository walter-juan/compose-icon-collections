package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.FileCheck24: ImageVector
    get() {
        if (_fileCheck24 != null) {
            return _fileCheck24!!
        }
        _fileCheck24 = Builder(name = "FileCheck24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.982f, 1.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, true, 1.415f, 0.586f)
                lineToRelative(4.017f, 4.018f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.018f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, false, -0.354f, 0.146f)
                arcTo(0.504f, 0.504f, 0.0f, false, false, 4.5f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.133f, 0.053f, 0.26f, 0.146f, 0.354f)
                arcTo(0.504f, 0.504f, 0.0f, false, false, 5.0f, 21.5f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(9.982f)
                close()
                moveTo(15.0f, 6.5f)
                curveToRelative(0.0f, 0.133f, 0.053f, 0.26f, 0.146f, 0.354f)
                arcTo(0.504f, 0.504f, 0.0f, false, false, 15.5f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.336f)
                lineToRelative(-4.018f, -4.018f)
                arcTo(0.502f, 0.502f, 0.0f, false, false, 15.0f, 2.5f)
                verticalLineToRelative(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 21.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(9.0f, 23.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(20.72f, 15.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-5.323f, 5.324f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.707f, 0.292f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, true, -0.707f, -0.292f)
                lineTo(12.72f, 19.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.97f, 1.969f)
                lineToRelative(4.97f, -4.969f)
                close()
                moveTo(19.5f, 12.25f)
                lineTo(19.5f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _fileCheck24!!
    }

private var _fileCheck24: ImageVector? = null
