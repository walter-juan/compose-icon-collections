package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 9.776f)
                curveTo(3.862f, 9.759f, 3.977f, 9.75f, 4.094f, 9.75f)
                horizontalLineTo(19.906f)
                curveTo(20.023f, 9.75f, 20.138f, 9.759f, 20.25f, 9.776f)
                moveTo(3.75f, 9.776f)
                curveTo(2.554f, 9.959f, 1.69f, 11.079f, 1.867f, 12.318f)
                lineTo(2.724f, 18.318f)
                curveTo(2.882f, 19.427f, 3.832f, 20.25f, 4.951f, 20.25f)
                horizontalLineTo(19.049f)
                curveTo(20.168f, 20.25f, 21.118f, 19.427f, 21.276f, 18.318f)
                lineTo(22.133f, 12.318f)
                curveTo(22.31f, 11.079f, 21.446f, 9.959f, 20.25f, 9.776f)
                moveTo(3.75f, 9.776f)
                verticalLineTo(6.0f)
                curveTo(3.75f, 4.757f, 4.757f, 3.75f, 6.0f, 3.75f)
                horizontalLineTo(9.879f)
                curveTo(10.276f, 3.75f, 10.658f, 3.908f, 10.939f, 4.189f)
                lineTo(13.061f, 6.311f)
                curveTo(13.342f, 6.592f, 13.724f, 6.75f, 14.121f, 6.75f)
                horizontalLineTo(18.0f)
                curveTo(19.243f, 6.75f, 20.25f, 7.757f, 20.25f, 9.0f)
                verticalLineTo(9.776f)
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
