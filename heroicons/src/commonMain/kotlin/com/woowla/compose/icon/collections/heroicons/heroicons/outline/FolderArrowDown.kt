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

public val OutlineGroup.FolderArrowDown: ImageVector
    get() {
        if (_folderArrowDown != null) {
            return _folderArrowDown!!
        }
        _folderArrowDown = Builder(name = "FolderArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.5f)
                lineTo(12.0f, 16.5f)
                moveTo(12.0f, 16.5f)
                lineTo(15.0f, 13.5f)
                moveTo(12.0f, 16.5f)
                lineTo(12.0f, 10.5f)
                moveTo(13.061f, 6.311f)
                lineTo(10.939f, 4.189f)
                curveTo(10.658f, 3.908f, 10.276f, 3.75f, 9.879f, 3.75f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 3.75f, 2.25f, 4.757f, 2.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.243f, 3.257f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 20.25f, 21.75f, 19.243f, 21.75f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(21.75f, 7.757f, 20.743f, 6.75f, 19.5f, 6.75f)
                horizontalLineTo(14.121f)
                curveTo(13.724f, 6.75f, 13.342f, 6.592f, 13.061f, 6.311f)
                close()
            }
        }
        .build()
        return _folderArrowDown!!
    }

private var _folderArrowDown: ImageVector? = null
