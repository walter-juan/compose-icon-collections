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

public val Octicons.Compose24: ImageVector
    get() {
        if (_compose24 != null) {
            return _compose24!!
        }
        _compose24 = Builder(name = "Compose24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.25f)
                verticalLineTo(4.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.75f, -1.75f)
                horizontalLineToRelative(7.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(2.75f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 2.5f, 4.0f)
                verticalLineToRelative(17.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineTo(20.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 20.0f, 23.0f)
                horizontalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.013f, 1.427f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.474f, 0.0f)
                lineToRelative(1.086f, 1.086f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.474f)
                lineToRelative(-8.61f, 8.61f)
                curveToRelative(-0.21f, 0.21f, -0.47f, 0.364f, -0.756f, 0.445f)
                lineToRelative(-3.25f, 0.929f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.928f, -0.927f)
                lineToRelative(0.929f, -3.25f)
                curveToRelative(0.082f, -0.287f, 0.235f, -0.547f, 0.445f, -0.758f)
                lineToRelative(8.61f, -8.61f)
                close()
                moveTo(11.463f, 11.097f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, false, -0.063f, 0.108f)
                lineToRelative(-0.558f, 1.953f)
                lineToRelative(1.953f, -0.558f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.108f, -0.064f)
                lineTo(19.19f, 6.25f)
                lineToRelative(-1.44f, -1.44f)
                close()
                moveTo(20.427f, 2.487f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, -0.177f, -0.073f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, -0.177f, 0.073f)
                lineTo(18.811f, 3.75f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(1.263f, -1.263f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, 0.073f, -0.177f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, -0.073f, -0.177f)
                close()
            }
        }
        .build()
        return _compose24!!
    }

private var _compose24: ImageVector? = null
